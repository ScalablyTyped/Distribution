package typings.googleapis.libraryagentV1Mod.libraryagentV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single book in the library.
  */
@js.native
trait SchemaGoogleExampleLibraryagentV1Book extends js.Object {
  
  /**
    * The name of the book author.
    */
  var author: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the book. Book names have the form
    * `shelves/{shelf_id}/books/{book_id}`. The name is ignored when creating a
    * book.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Value indicating whether the book has been read.
    */
  var read: js.UndefOr[Boolean] = js.native
  
  /**
    * The title of the book.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaGoogleExampleLibraryagentV1Book {
  
  @scala.inline
  def apply(): SchemaGoogleExampleLibraryagentV1Book = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1Book]
  }
  
  @scala.inline
  implicit class SchemaGoogleExampleLibraryagentV1BookOps[Self <: SchemaGoogleExampleLibraryagentV1Book] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
