package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A field of an index.
  */
trait SchemaGoogleFirestoreAdminV1beta1IndexField extends StObject {
  
  /**
    * The path of the field. Must match the field path specification described
    * by google.firestore.v1beta1.Document.fields. Special field path
    * `__name__` may be used by itself or at the end of a path. `__type__` may
    * be used only at the end of path.
    */
  var fieldPath: js.UndefOr[String] = js.undefined
  
  /**
    * The field&#39;s mode.
    */
  var mode: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta1IndexField {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta1IndexField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1IndexField]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta1IndexFieldMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta1IndexField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
