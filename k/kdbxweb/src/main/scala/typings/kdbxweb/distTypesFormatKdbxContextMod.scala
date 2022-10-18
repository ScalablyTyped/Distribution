package typings.kdbxweb

import typings.kdbxweb.anon.ExportXml
import typings.kdbxweb.distTypesFormatKdbxMod.Kdbx
import typings.kdbxweb.distTypesUtilsXmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormatKdbxContextMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-context", "KdbxContext")
  @js.native
  open class KdbxContext protected () extends StObject {
    def this(opts: ExportXml) = this()
    
    var exportXml: Boolean = js.native
    
    val kdbx: Kdbx = js.native
    
    def setXmlDate(node: Node): Unit = js.native
    def setXmlDate(node: Node, dt: js.Date): Unit = js.native
  }
}
