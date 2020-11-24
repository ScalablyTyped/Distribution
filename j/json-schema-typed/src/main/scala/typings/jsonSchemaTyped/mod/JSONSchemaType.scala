package typings.jsonSchemaTyped.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JSONSchemaType extends _JSONSchemaTypeValue
@JSImport("json-schema-typed", "JSONSchemaType")
@js.native
object JSONSchemaType extends js.Object {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[JSONSchemaType with java.lang.String] = js.native
  
  /**
    * Array
    */
  @js.native
  sealed trait Array extends JSONSchemaType
  /* "array" */ @js.native
  object Array
    extends TopLevel[Array with java.lang.String]
  
  /**
    * Boolean
    */
  @js.native
  sealed trait Boolean extends JSONSchemaType
  /* "boolean" */ @js.native
  object Boolean
    extends TopLevel[Boolean with java.lang.String]
  
  /**
    * Integer
    */
  @js.native
  sealed trait Integer extends JSONSchemaType
  /* "integer" */ @js.native
  object Integer
    extends TopLevel[Integer with java.lang.String]
  
  /**
    * Null
    */
  @js.native
  sealed trait Null extends JSONSchemaType
  /* "null" */ @js.native
  object Null
    extends TopLevel[Null with java.lang.String]
  
  /**
    * Number
    */
  @js.native
  sealed trait Number extends JSONSchemaType
  /* "number" */ @js.native
  object Number
    extends TopLevel[Number with java.lang.String]
  
  /**
    * Object
    */
  @js.native
  sealed trait Object extends JSONSchemaType
  /* "object" */ @js.native
  object Object
    extends TopLevel[Object with java.lang.String]
  
  /**
    * String
    */
  @js.native
  sealed trait String extends JSONSchemaType
  /* "string" */ @js.native
  object String
    extends TopLevel[String with java.lang.String]
}
