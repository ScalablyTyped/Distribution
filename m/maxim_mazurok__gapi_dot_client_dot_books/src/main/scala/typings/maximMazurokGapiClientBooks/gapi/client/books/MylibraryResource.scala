package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MylibraryResource extends StObject {
  
  var annotations: AnnotationsResource = js.native
  
  var bookshelves: BookshelvesResource = js.native
  
  var readingpositions: ReadingpositionsResource = js.native
}
object MylibraryResource {
  
  @scala.inline
  def apply(
    annotations: AnnotationsResource,
    bookshelves: BookshelvesResource,
    readingpositions: ReadingpositionsResource
  ): MylibraryResource = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], bookshelves = bookshelves.asInstanceOf[js.Any], readingpositions = readingpositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MylibraryResource]
  }
  
  @scala.inline
  implicit class MylibraryResourceMutableBuilder[Self <: MylibraryResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: AnnotationsResource): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookshelves(value: BookshelvesResource): Self = StObject.set(x, "bookshelves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingpositions(value: ReadingpositionsResource): Self = StObject.set(x, "readingpositions", value.asInstanceOf[js.Any])
  }
}
