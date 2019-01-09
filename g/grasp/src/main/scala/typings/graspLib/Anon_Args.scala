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

