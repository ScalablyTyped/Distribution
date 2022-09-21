package typings.jsonApiSerializer

import typings.jsonApiSerializer.mod.Case
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonApiSerializerStrings {
  
  @js.native
  sealed trait camelCase
    extends StObject
       with Case
  inline def camelCase: camelCase = "camelCase".asInstanceOf[camelCase]
  
  @js.native
  sealed trait id extends StObject
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait `kebab-case`
    extends StObject
       with Case
  inline def `kebab-case`: `kebab-case` = "kebab-case".asInstanceOf[`kebab-case`]
  
  @js.native
  sealed trait snake_case
    extends StObject
       with Case
  inline def snake_case: snake_case = "snake_case".asInstanceOf[snake_case]
}
