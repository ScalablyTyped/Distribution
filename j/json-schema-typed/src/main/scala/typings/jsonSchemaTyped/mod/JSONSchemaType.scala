package typings.jsonSchemaTyped.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JSONSchemaType extends _JSONSchemaTypeValue

@JSImport("json-schema-typed", "JSONSchemaType")
@js.native
object JSONSchemaType extends js.Object {
  /**
    * Array
    */
  @js.native
  sealed trait Array extends JSONSchemaType
  
  /**
    * Boolean
    */
  @js.native
  sealed trait Boolean extends JSONSchemaType
  
  /**
    * Integer
    */
  @js.native
  sealed trait Integer extends JSONSchemaType
  
  /**
    * Null
    */
  @js.native
  sealed trait Null extends JSONSchemaType
  
  /**
    * Number
    */
  @js.native
  sealed trait Number extends JSONSchemaType
  
  /**
    * Object
    */
  @js.native
  sealed trait Object extends JSONSchemaType
  
  /**
    * String
    */
  @js.native
  sealed trait String extends JSONSchemaType
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[JSONSchemaType with java.lang.String] = js.native
  /* "array" */ @js.native
  object Array
    extends TopLevel[Array with java.lang.String]
  
  /* "boolean" */ @js.native
  object Boolean
    extends TopLevel[Boolean with java.lang.String]
  
  /* "integer" */ @js.native
  object Integer
    extends TopLevel[Integer with java.lang.String]
  
  /* "null" */ @js.native
  object Null
    extends TopLevel[Null with java.lang.String]
  
  /* "number" */ @js.native
  object Number
    extends TopLevel[Number with java.lang.String]
  
  /* "object" */ @js.native
  object Object
    extends TopLevel[Object with java.lang.String]
  
  /* "string" */ @js.native
  object String
    extends TopLevel[String with java.lang.String]
  
}

