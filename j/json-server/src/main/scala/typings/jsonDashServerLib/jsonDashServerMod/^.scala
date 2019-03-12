package typings
package jsonDashServerLib.jsonDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val bodyParser: js.Tuple2[
    connectLib.connectMod.createServerNs.NextHandleFunction, 
    connectLib.connectMod.createServerNs.NextHandleFunction
  ] = js.native
  def create(): expressLib.expressMod.eNs.Application = js.native
  def defaults(): js.Array[expressLib.expressMod.eNs.RequestHandler] = js.native
  def defaults(options: MiddlewaresOptions): js.Array[expressLib.expressMod.eNs.RequestHandler] = js.native
  def rewriter(rules: org.scalablytyped.runtime.StringDictionary[java.lang.String]): expressLib.expressMod.eNs.Router = js.native
  def router(source: java.lang.String): expressLib.expressMod.eNs.Router = js.native
  def router(source: java.lang.String, options: jsonDashServerLib.Anon_ForeignKeySuffix): expressLib.expressMod.eNs.Router = js.native
  def router(source: js.Object): expressLib.expressMod.eNs.Router = js.native
  def router(source: js.Object, options: jsonDashServerLib.Anon_ForeignKeySuffix): expressLib.expressMod.eNs.Router = js.native
}

