package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structured results that are returned as part of search request.
  */
@js.native
trait SchemaStructuredResult extends js.Object {
  
  /**
    * Representation of a person
    */
  var person: js.UndefOr[SchemaPerson] = js.native
}
object SchemaStructuredResult {
  
  @scala.inline
  def apply(): SchemaStructuredResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredResult]
  }
  
  @scala.inline
  implicit class SchemaStructuredResultOps[Self <: SchemaStructuredResult] (val x: Self) extends AnyVal {
    
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
    def setPerson(value: SchemaPerson): Self = this.set("person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerson: Self = this.set("person", js.undefined)
  }
}
