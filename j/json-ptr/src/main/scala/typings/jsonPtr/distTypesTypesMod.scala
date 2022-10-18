package typings.jsonPtr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  type Decoder = js.Function1[/* ptr */ Pointer, PathSegments]
  
  type Encoder = js.Function1[/* ptr */ PathSegments, Pointer]
  
  type JsonStringPointer = String
  
  trait JsonStringPointerListItem extends StObject {
    
    /**
      * Contains the location of the value in the evaluated object graph.
      */
    val pointer: JsonStringPointer
    
    /**
      * The value at the pointer's location in the object graph.
      */
    val value: Any
  }
  object JsonStringPointerListItem {
    
    inline def apply(pointer: JsonStringPointer, value: Any): JsonStringPointerListItem = {
      val __obj = js.Dynamic.literal(pointer = pointer.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonStringPointerListItem]
    }
    
    extension [Self <: JsonStringPointerListItem](x: Self) {
      
      inline def setPointer(value: JsonStringPointer): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type PathSegment = String | Double
  
  type PathSegments = js.Array[PathSegment]
  
  type Pointer = JsonStringPointer | UriFragmentIdentifierPointer
  
  type RelativeJsonPointer = String
  
  type UriFragmentIdentifierPointer = String
  
  trait UriFragmentIdentifierPointerListItem extends StObject {
    
    /**
      * Contains the location (as a fragmentId) of the value in the evaluated object graph.
      */
    val fragmentId: UriFragmentIdentifierPointer
    
    /**
      * The value at the pointer's location in the object graph.
      */
    val value: Any
  }
  object UriFragmentIdentifierPointerListItem {
    
    inline def apply(fragmentId: UriFragmentIdentifierPointer, value: Any): UriFragmentIdentifierPointerListItem = {
      val __obj = js.Dynamic.literal(fragmentId = fragmentId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UriFragmentIdentifierPointerListItem]
    }
    
    extension [Self <: UriFragmentIdentifierPointerListItem](x: Self) {
      
      inline def setFragmentId(value: UriFragmentIdentifierPointer): Self = StObject.set(x, "fragmentId", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
