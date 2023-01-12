package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.WhichJobs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limit extends StObject {
  
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var `my-jobs`: js.UndefOr[Boolean] = js.undefined
  
  var `printer-uri`: js.UndefOr[String] = js.undefined
  
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204, starting with typings.ipp.mod.RequestedJobAttributeGroups, typings.ipp.ippStrings.`chamber-humidity`, typings.ipp.ippStrings.`chamber-temperature` */ Any
    ]
  ] = js.undefined
  
  var `requesting-user-name`: String
  
  var `which-jobs`: js.UndefOr[WhichJobs] = js.undefined
}
object Limit {
  
  inline def apply(`requesting-user-name`: String): Limit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
    
    inline def `setAttributes-charset`(value: CharacterSet): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    inline def `setAttributes-charsetUndefined`: Self = StObject.set(x, "attributes-charset", js.undefined)
    
    inline def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    inline def `setAttributes-natural-languageUndefined`: Self = StObject.set(x, "attributes-natural-language", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def `setMy-jobs`(value: Boolean): Self = StObject.set(x, "my-jobs", value.asInstanceOf[js.Any])
    
    inline def `setMy-jobsUndefined`: Self = StObject.set(x, "my-jobs", js.undefined)
    
    inline def `setPrinter-uri`(value: String): Self = StObject.set(x, "printer-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-uriUndefined`: Self = StObject.set(x, "printer-uri", js.undefined)
    
    inline def `setRequested-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204, starting with typings.ipp.mod.RequestedJobAttributeGroups, typings.ipp.ippStrings.`chamber-humidity`, typings.ipp.ippStrings.`chamber-temperature` */ Any
        ]
    ): Self = StObject.set(x, "requested-attributes", value.asInstanceOf[js.Any])
    
    inline def `setRequested-attributesUndefined`: Self = StObject.set(x, "requested-attributes", js.undefined)
    
    inline def `setRequested-attributesVarargs`(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204, starting with typings.ipp.mod.RequestedJobAttributeGroups, typings.ipp.ippStrings.`chamber-humidity`, typings.ipp.ippStrings.`chamber-temperature` */ Any)*
    ): Self = StObject.set(x, "requested-attributes", js.Array(value*))
    
    inline def `setRequesting-user-name`(value: String): Self = StObject.set(x, "requesting-user-name", value.asInstanceOf[js.Any])
    
    inline def `setWhich-jobs`(value: WhichJobs): Self = StObject.set(x, "which-jobs", value.asInstanceOf[js.Any])
    
    inline def `setWhich-jobsUndefined`: Self = StObject.set(x, "which-jobs", js.undefined)
  }
}
