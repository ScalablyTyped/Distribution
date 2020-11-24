package typings.maximMazurokGapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MylibraryResource extends js.Object {
  
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
  implicit class MylibraryResourceOps[Self <: MylibraryResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotations(value: AnnotationsResource): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookshelves(value: BookshelvesResource): Self = this.set("bookshelves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingpositions(value: ReadingpositionsResource): Self = this.set("readingpositions", value.asInstanceOf[js.Any])
  }
}
