package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ref[TSrc /* <: java.lang.String */, TMapping /* <: js.Object */]
  extends Raw[java.lang.String] {
  def as[TAlias /* <: java.lang.String */](alias: TAlias): Ref[
    TSrc, 
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in TAlias ]: TSrc}
    */ knexLib.knexLibStrings.Ref with js.Any
  ] = js.native
  def withSchema(schema: java.lang.String): this.type = js.native
}

