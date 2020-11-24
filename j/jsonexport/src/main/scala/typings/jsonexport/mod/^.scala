package typings.jsonexport.mod

import typings.node.streamMod.Transform
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonexport", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Main declare function that converts json to csv
    *
    * @param json - object or array to convert
    * @param options - csv options
    * @param callback(err, csv) - Callback declare function
    *      if error, returning error in call back.
    *      if csv is created successfully, returning csv output to callback.
    */
  def apply(): Transform = js.native
  def apply(json: js.Array[js.Object]): js.Promise[String] = js.native
  def apply(json: js.Array[js.Object], cb: js.Function2[/* err */ Error, /* csv */ String, Unit]): Unit = js.native
  def apply(json: js.Array[js.Object], userOptions: UserOptions): js.Promise[String] = js.native
  def apply(
    json: js.Array[js.Object],
    userOptions: UserOptions,
    cb: js.Function2[/* err */ Error, /* csv */ String, Unit]
  ): Unit = js.native
  def apply(json: js.Object): js.Promise[String] = js.native
  def apply(json: js.Object, cb: js.Function2[/* err */ Error, /* csv */ String, Unit]): Unit = js.native
  def apply(json: js.Object, userOptions: UserOptions): js.Promise[String] = js.native
  def apply(
    json: js.Object,
    userOptions: UserOptions,
    cb: js.Function2[/* err */ Error, /* csv */ String, Unit]
  ): Unit = js.native
  def apply(userOptions: UserOptions): Transform = js.native
}
