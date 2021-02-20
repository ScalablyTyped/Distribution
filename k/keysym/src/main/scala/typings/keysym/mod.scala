package typings.keysym

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keysym", "fromKeysym")
  @js.native
  def fromKeysym(keysym: Double): js.UndefOr[Record] = js.native
  
  @JSImport("keysym", "fromName")
  @js.native
  def fromName(name: String): js.UndefOr[Record] = js.native
  
  @JSImport("keysym", "fromUnicode")
  @js.native
  def fromUnicode(code: String): js.Array[Record] = js.native
  @JSImport("keysym", "fromUnicode")
  @js.native
  def fromUnicode(code: Double): js.Array[Record] = js.native
  
  @JSImport("keysym", "records")
  @js.native
  val records: js.Array[Record] = js.native
  
  @js.native
  trait Record extends StObject {
    
    var keysym: Double = js.native
    
    var names: js.Array[String] = js.native
    
    var status: String = js.native
    
    var unicode: Double = js.native
  }
  object Record {
    
    @scala.inline
    def apply(keysym: Double, names: js.Array[String], status: String, unicode: Double): Record = {
      val __obj = js.Dynamic.literal(keysym = keysym.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Record]
    }
    
    @scala.inline
    implicit class RecordMutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeysym(value: Double): Self = StObject.set(x, "keysym", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicode(value: Double): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    }
  }
}
