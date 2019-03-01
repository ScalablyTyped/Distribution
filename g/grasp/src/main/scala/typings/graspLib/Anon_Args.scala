package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.Array[java.lang.String] | (stdLib.Record[java.lang.String, _]) | java.lang.String
  var callback: js.UndefOr[js.Function1[/* result */ java.lang.String, scala.Unit]] = js.undefined
  var console: js.UndefOr[nodeLib.Console with stdLib.Console] = js.undefined
  var error: js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]] = js.undefined
  var exit: js.UndefOr[js.Function1[/* code */ scala.Double, scala.Unit]] = js.undefined
  // The following are "overrides" for defaults, such as console, cli-color,
  // process.stdin, or fs. In most cases grasp only makes use of a small
  // surface area of the types, but I think if someone really wants to pass a
  // fake fs that only implements the subset of methods they think grasp uses,
  // it should be up to them to use a cast rather than the typedef to be
  // overly lenient. We never know if grasp might change their internal use of
  // fs, after all.
  var fs: js.UndefOr[Anon_AccessAccessSync] = js.undefined
  var input: js.UndefOr[java.lang.String] = js.undefined
  var stdin: js.UndefOr[nodeLib.NodeJSNs.ReadStream] = js.undefined
  var textFormat: js.UndefOr[Anon_M with cliDashColorLib.cliDashColorMod.mNs.Format] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] | (stdLib.Record[java.lang.String, _]) | java.lang.String,
    callback: js.Function1[/* result */ java.lang.String, scala.Unit] = null,
    console: nodeLib.Console with stdLib.Console = null,
    error: js.Function1[/* message */ java.lang.String, scala.Unit] = null,
    exit: js.Function1[/* code */ scala.Double, scala.Unit] = null,
    fs: Anon_AccessAccessSync = null,
    input: java.lang.String = null,
    stdin: nodeLib.NodeJSNs.ReadStream = null,
    textFormat: Anon_M with cliDashColorLib.cliDashColorMod.mNs.Format = null
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (console != null) __obj.updateDynamic("console")(console)
    if (error != null) __obj.updateDynamic("error")(error)
    if (exit != null) __obj.updateDynamic("exit")(exit)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (input != null) __obj.updateDynamic("input")(input)
    if (stdin != null) __obj.updateDynamic("stdin")(stdin)
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat)
    __obj.asInstanceOf[Anon_Args]
  }
}

