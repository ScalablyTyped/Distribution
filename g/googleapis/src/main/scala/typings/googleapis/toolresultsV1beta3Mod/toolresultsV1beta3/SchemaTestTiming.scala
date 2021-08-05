package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Testing timing break down to know phases.
  */
trait SchemaTestTiming extends StObject {
  
  /**
    * How long it took to run the test process.  - In response: present if
    * previously set. - In create/update request: optional
    */
  var testProcessDuration: js.UndefOr[SchemaDuration] = js.undefined
}
object SchemaTestTiming {
  
  inline def apply(): SchemaTestTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestTiming]
  }
  
  extension [Self <: SchemaTestTiming](x: Self) {
    
    inline def setTestProcessDuration(value: SchemaDuration): Self = StObject.set(x, "testProcessDuration", value.asInstanceOf[js.Any])
    
    inline def setTestProcessDurationUndefined: Self = StObject.set(x, "testProcessDuration", js.undefined)
  }
}
