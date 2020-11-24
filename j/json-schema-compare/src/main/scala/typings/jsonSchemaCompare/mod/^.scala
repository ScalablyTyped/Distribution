package typings.jsonSchemaCompare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-schema-compare", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Compare json schemas correctly.
    *
    * - Ignores sort for arrays where sort does not matter, like required, enum, type, anyOf, oneOf, anyOf, dependencies (if array)
    * - Compares correctly type when array or string
    * - Ignores duplicate values before comparing
    * - For schemas and sub schemas `undefined`, `true` and `{}` are equal
    * - For minLength, minItems and minProperties `undefined` and `0` are equal
    * - For uniqueItems, `undefined` and `false` are equal
    */
  def apply(a: JSONSchemaComparee, b: JSONSchemaComparee): Boolean = js.native
  def apply(a: JSONSchemaComparee, b: JSONSchemaComparee, options: Options): Boolean = js.native
}
