package typings.kdbxweb.mod

import typings.kdbxweb.xmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxTimes")
@js.native
open class KdbxTimes ()
  extends typings.kdbxweb.kdbxTimesMod.KdbxTimes
/* static members */
object KdbxTimes {
  
  @JSImport("kdbxweb", "KdbxTimes")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.kdbxweb.kdbxTimesMod.KdbxTimes = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.kdbxweb.kdbxTimesMod.KdbxTimes]
  
  inline def read(xmlNode: Node): typings.kdbxweb.kdbxTimesMod.KdbxTimes = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any]).asInstanceOf[typings.kdbxweb.kdbxTimesMod.KdbxTimes]
}
