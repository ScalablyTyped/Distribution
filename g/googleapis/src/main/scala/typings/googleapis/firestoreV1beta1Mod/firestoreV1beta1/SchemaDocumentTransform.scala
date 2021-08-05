package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A transformation of a document.
  */
trait SchemaDocumentTransform extends StObject {
  
  /**
    * The name of the document to transform.
    */
  var document: js.UndefOr[String] = js.undefined
  
  /**
    * The list of transformations to apply to the fields of the document, in
    * order. This must not be empty.
    */
  var fieldTransforms: js.UndefOr[js.Array[SchemaFieldTransform]] = js.undefined
}
object SchemaDocumentTransform {
  
  inline def apply(): SchemaDocumentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentTransform]
  }
  
  extension [Self <: SchemaDocumentTransform](x: Self) {
    
    inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setFieldTransforms(value: js.Array[SchemaFieldTransform]): Self = StObject.set(x, "fieldTransforms", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformsUndefined: Self = StObject.set(x, "fieldTransforms", js.undefined)
    
    inline def setFieldTransformsVarargs(value: SchemaFieldTransform*): Self = StObject.set(x, "fieldTransforms", js.Array(value :_*))
  }
}
