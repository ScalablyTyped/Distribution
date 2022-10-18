package typings.kdbxweb.mod

import typings.kdbxweb.anon.PreserveXml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Kdbx")
@js.native
open class Kdbx ()
  extends typings.kdbxweb.distTypesFormatKdbxMod.Kdbx
/* static members */
object Kdbx {
  
  @JSImport("kdbxweb", "Kdbx")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new database
    */
  inline def create(credentials: typings.kdbxweb.distTypesFormatKdbxCredentialsMod.KdbxCredentials, name: String): typings.kdbxweb.distTypesFormatKdbxMod.Kdbx = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(credentials.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.kdbxweb.distTypesFormatKdbxMod.Kdbx]
  
  /**
    * Load a kdbx file
    * If there was an error loading file, throws an exception
    */
  inline def load(
    data: js.typedarray.ArrayBuffer,
    credentials: typings.kdbxweb.distTypesFormatKdbxCredentialsMod.KdbxCredentials
  ): js.Promise[typings.kdbxweb.distTypesFormatKdbxMod.Kdbx] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kdbxweb.distTypesFormatKdbxMod.Kdbx]]
  inline def load(
    data: js.typedarray.ArrayBuffer,
    credentials: typings.kdbxweb.distTypesFormatKdbxCredentialsMod.KdbxCredentials,
    options: PreserveXml
  ): js.Promise[typings.kdbxweb.distTypesFormatKdbxMod.Kdbx] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kdbxweb.distTypesFormatKdbxMod.Kdbx]]
  
  /**
    * Import database from an xml file
    * If there was an error loading file, throws an exception
    */
  inline def loadXml(data: String, credentials: typings.kdbxweb.distTypesFormatKdbxCredentialsMod.KdbxCredentials): js.Promise[typings.kdbxweb.distTypesFormatKdbxMod.Kdbx] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadXml")(data.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kdbxweb.distTypesFormatKdbxMod.Kdbx]]
}
