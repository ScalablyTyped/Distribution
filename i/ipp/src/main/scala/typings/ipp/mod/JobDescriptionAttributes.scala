package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobDescriptionAttributes extends StObject {
  
  var `current-page-order`: js.UndefOr[PageOrder] = js.native
  
  var `document-metadata`: js.UndefOr[js.Array[String]] = js.native
  
  var `job-charge-info`: js.UndefOr[String] = js.native
  
  var `job-mandatory-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ]
  ] = js.native
  
  var `job-message-from-operator`: js.UndefOr[String] = js.native
  
  var `job-message-to-operator-actual`: js.UndefOr[js.Array[String]] = js.native
  
  var `job-name`: js.UndefOr[String] = js.native
  
  var `job-save-printer-make-and-model`: js.UndefOr[String] = js.native
}
object JobDescriptionAttributes {
  
  @scala.inline
  def apply(): JobDescriptionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDescriptionAttributes]
  }
  
  @scala.inline
  implicit class JobDescriptionAttributesMutableBuilder[Self <: JobDescriptionAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setCurrent-page-order`(value: PageOrder): Self = StObject.set(x, "current-page-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-page-orderUndefined`: Self = StObject.set(x, "current-page-order", js.undefined)
    
    @scala.inline
    def `setDocument-metadata`(value: js.Array[String]): Self = StObject.set(x, "document-metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-metadataUndefined`: Self = StObject.set(x, "document-metadata", js.undefined)
    
    @scala.inline
    def `setDocument-metadataVarargs`(value: String*): Self = StObject.set(x, "document-metadata", js.Array(value :_*))
    
    @scala.inline
    def `setJob-charge-info`(value: String): Self = StObject.set(x, "job-charge-info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-charge-infoUndefined`: Self = StObject.set(x, "job-charge-info", js.undefined)
    
    @scala.inline
    def `setJob-mandatory-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
        ]
    ): Self = StObject.set(x, "job-mandatory-attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-mandatory-attributesUndefined`: Self = StObject.set(x, "job-mandatory-attributes", js.undefined)
    
    @scala.inline
    def `setJob-mandatory-attributesVarargs`(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any)*): Self = StObject.set(x, "job-mandatory-attributes", js.Array(value :_*))
    
    @scala.inline
    def `setJob-message-from-operator`(value: String): Self = StObject.set(x, "job-message-from-operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-message-from-operatorUndefined`: Self = StObject.set(x, "job-message-from-operator", js.undefined)
    
    @scala.inline
    def `setJob-message-to-operator-actual`(value: js.Array[String]): Self = StObject.set(x, "job-message-to-operator-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-message-to-operator-actualUndefined`: Self = StObject.set(x, "job-message-to-operator-actual", js.undefined)
    
    @scala.inline
    def `setJob-message-to-operator-actualVarargs`(value: String*): Self = StObject.set(x, "job-message-to-operator-actual", js.Array(value :_*))
    
    @scala.inline
    def `setJob-name`(value: String): Self = StObject.set(x, "job-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-nameUndefined`: Self = StObject.set(x, "job-name", js.undefined)
    
    @scala.inline
    def `setJob-save-printer-make-and-model`(value: String): Self = StObject.set(x, "job-save-printer-make-and-model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-save-printer-make-and-modelUndefined`: Self = StObject.set(x, "job-save-printer-make-and-model", js.undefined)
  }
}
