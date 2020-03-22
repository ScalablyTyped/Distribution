package typings.luminoCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonMod {
  type JSONPrimitive = scala.Boolean | scala.Double | java.lang.String | scala.Null
  /* Rewritten from type alias, can be one of: 
    - typings.luminoCoreutils.jsonMod.JSONPrimitive
    - typings.luminoCoreutils.jsonMod.JSONObject
    - typings.luminoCoreutils.jsonMod.JSONArray
  */
  type JSONValue = typings.luminoCoreutils.jsonMod._JSONValue | typings.luminoCoreutils.jsonMod.JSONPrimitive
  /* Rewritten from type alias, can be one of: 
    - typings.luminoCoreutils.jsonMod.JSONPrimitive
    - typings.luminoCoreutils.jsonMod.PartialJSONObject
    - typings.luminoCoreutils.jsonMod.PartialJSONArray
  */
  type PartialJSONValue = typings.luminoCoreutils.jsonMod._PartialJSONValue | typings.luminoCoreutils.jsonMod.JSONPrimitive
  /* Rewritten from type alias, can be one of: 
    - typings.luminoCoreutils.jsonMod.JSONPrimitive
    - typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
    - typings.luminoCoreutils.jsonMod.ReadonlyJSONArray
  */
  type ReadonlyJSONValue = typings.luminoCoreutils.jsonMod._ReadonlyJSONValue | typings.luminoCoreutils.jsonMod.JSONPrimitive
  /* Rewritten from type alias, can be one of: 
    - typings.luminoCoreutils.jsonMod.JSONPrimitive
    - typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
    - typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONArray
  */
  type ReadonlyPartialJSONValue = typings.luminoCoreutils.jsonMod._ReadonlyPartialJSONValue | typings.luminoCoreutils.jsonMod.JSONPrimitive
}
