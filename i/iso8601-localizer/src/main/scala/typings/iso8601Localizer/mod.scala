package typings.iso8601Localizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iso8601-localizer", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ISO8601Localizer {
    def this(userISO8601: String) = this()
    
    /* CompleteClass */
    override def localize(): String = js.native
    
    /* CompleteClass */
    override def returnAs(as: String): localizer = js.native
    
    /* CompleteClass */
    override def to(offset: Double): localizer = js.native
  }
}
