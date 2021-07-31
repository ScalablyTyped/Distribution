package typings.jsonSchemaTyped.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JSONSchemaType
  extends StObject
     with _JSONSchemaTypeValue
@JSImport("json-schema-typed", "JSONSchemaType")
@js.native
object JSONSchemaType extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[JSONSchemaType & java.lang.String] = js.native
  
  /**
    * Array
    */
  @js.native
  sealed trait Array
    extends StObject
       with JSONSchemaType
  /* "array" */ val Array: typings.jsonSchemaTyped.mod.JSONSchemaType.Array & java.lang.String = js.native
  
  /**
    * Boolean
    */
  @js.native
  sealed trait Boolean
    extends StObject
       with JSONSchemaType
  /* "boolean" */ val Boolean: typings.jsonSchemaTyped.mod.JSONSchemaType.Boolean & java.lang.String = js.native
  
  /**
    * Integer
    */
  @js.native
  sealed trait Integer
    extends StObject
       with JSONSchemaType
  /* "integer" */ val Integer: typings.jsonSchemaTyped.mod.JSONSchemaType.Integer & java.lang.String = js.native
  
  /**
    * Null
    */
  @js.native
  sealed trait Null
    extends StObject
       with JSONSchemaType
  /* "null" */ val Null: typings.jsonSchemaTyped.mod.JSONSchemaType.Null & java.lang.String = js.native
  
  /**
    * Number
    */
  @js.native
  sealed trait Number
    extends StObject
       with JSONSchemaType
  /* "number" */ val Number: typings.jsonSchemaTyped.mod.JSONSchemaType.Number & java.lang.String = js.native
  
  /**
    * Object
    */
  @js.native
  sealed trait Object
    extends StObject
       with JSONSchemaType
  /* "object" */ val Object: typings.jsonSchemaTyped.mod.JSONSchemaType.Object & java.lang.String = js.native
  
  /**
    * String
    */
  @js.native
  sealed trait String
    extends StObject
       with JSONSchemaType
  /* "string" */ val String: typings.jsonSchemaTyped.mod.JSONSchemaType.String & java.lang.String = js.native
}
