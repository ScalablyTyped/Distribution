package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.WhichJobs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Limit extends StObject {
  
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.native
  
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var `my-jobs`: js.UndefOr[Boolean] = js.native
  
  var `printer-uri`: js.UndefOr[String] = js.native
  
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any
    ]
  ] = js.native
  
  var `requesting-user-name`: String = js.native
  
  var `which-jobs`: js.UndefOr[WhichJobs] = js.native
}
object Limit {
  
  @scala.inline
  def apply(`requesting-user-name`: String): Limit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  
  @scala.inline
  implicit class LimitMutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAttributes-charset`(value: CharacterSet): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-charsetUndefined`: Self = StObject.set(x, "attributes-charset", js.undefined)
    
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-natural-languageUndefined`: Self = StObject.set(x, "attributes-natural-language", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def `setMy-jobs`(value: Boolean): Self = StObject.set(x, "my-jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMy-jobsUndefined`: Self = StObject.set(x, "my-jobs", js.undefined)
    
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
    
    @scala.inline
    def `setRequesting-user-name`(value: String): Self = StObject.set(x, "requesting-user-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWhich-jobs`(value: WhichJobs): Self = StObject.set(x, "which-jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWhich-jobsUndefined`: Self = StObject.set(x, "which-jobs", js.undefined)
  }
}
