package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ref[TSrc /* <: String */, TMapping /* <: js.Object */] extends Raw[String] {
  def as[TAlias /* <: String */](alias: TAlias): Ref[
    TSrc, 
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in TAlias ]: TSrc}
    */ typings.knex.knexStrings.Ref with js.Any
  ] = js.native
  def withSchema(schema: String): this.type = js.native
}

