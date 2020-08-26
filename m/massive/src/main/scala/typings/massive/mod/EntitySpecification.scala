package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitySpecification extends js.Object {
  /** A Database. */
  var db: Database = js.native
  /** Name of the loader that discovered the entity. */
  var loader: String = js.native
  /** The entity's name. */
  var name: String = js.native
  /** Path to the entity, if a file. */
  var path: String = js.native
  /** Entity's owning schema, if a database object. */
  var schema: String = js.native
}

object EntitySpecification {
  @scala.inline
  def apply(db: Database, loader: String, name: String, path: String, schema: String): EntitySpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitySpecification]
  }
  @scala.inline
  implicit class EntitySpecificationOps[Self <: EntitySpecification] (val x: Self) extends AnyVal {
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
    def setDb(value: Database): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoader(value: String): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
  
}

