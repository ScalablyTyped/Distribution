package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requestedattributes extends StObject {
  
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  
  var `job-id`: js.UndefOr[Double] = js.undefined
  
  var `job-uri`: js.UndefOr[String] = js.undefined
  
  var `printer-uri`: js.UndefOr[String] = js.undefined
  
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any
    ]
  ] = js.undefined
}
object Requestedattributes {
  
  @scala.inline
  def apply(): Requestedattributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Requestedattributes]
  }
  
  @scala.inline
  implicit class RequestedattributesMutableBuilder[Self <: Requestedattributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAttributes-charset`(value: CharacterSet): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-charsetUndefined`: Self = StObject.set(x, "attributes-charset", js.undefined)
    
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-natural-languageUndefined`: Self = StObject.set(x, "attributes-natural-language", js.undefined)
    
    @scala.inline
    def `setJob-id`(value: Double): Self = StObject.set(x, "job-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-idUndefined`: Self = StObject.set(x, "job-id", js.undefined)
    
    @scala.inline
    def `setJob-uri`(value: String): Self = StObject.set(x, "job-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-uriUndefined`: Self = StObject.set(x, "job-uri", js.undefined)
    
    @scala.inline
    def `setPrinter-uri`(value: String): Self = StObject.set(x, "printer-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrinter-uriUndefined`: Self = StObject.set(x, "printer-uri", js.undefined)
    
    @scala.inline
    def `setRequested-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any
        ]
    ): Self = StObject.set(x, "requested-attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRequested-attributesUndefined`: Self = StObject.set(x, "requested-attributes", js.undefined)
    
    @scala.inline
    def `setRequested-attributesVarargs`(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any)*
    ): Self = StObject.set(x, "requested-attributes", js.Array(value :_*))
  }
}
