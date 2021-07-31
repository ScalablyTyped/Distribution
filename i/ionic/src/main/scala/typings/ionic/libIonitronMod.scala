package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIonitronMod {
  
  @JSImport("ionic/lib/ionitron", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getIonitronString(quote: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIonitronString")(quote.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object ionitronStatements {
    
    @JSImport("ionic/lib/ionitron", "ionitronStatements")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ionic/lib/ionitron", "ionitronStatements.en")
    @js.native
    def en: js.Array[String] = js.native
    @scala.inline
    def en_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("en")(x.asInstanceOf[js.Any])
    
    @JSImport("ionic/lib/ionitron", "ionitronStatements.es")
    @js.native
    def es: js.Array[String] = js.native
    @scala.inline
    def es_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("es")(x.asInstanceOf[js.Any])
  }
}
