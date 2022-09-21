package typings.googleapis

import typings.googleapisCommon.schemaMod.SchemaItem
import typings.googleapisCommon.schemaMod.SchemaMethod
import typings.googleapisCommon.schemaMod.SchemaParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filtersMod {
  
  @JSImport("googleapis/build/src/generator/filters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildurl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildurl")().asInstanceOf[String]
  inline def buildurl(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildurl")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def camelify(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelify")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cleanComments(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanComments")().asInstanceOf[String]
  inline def cleanComments(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanComments")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cleanPropertyName(prop: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanPropertyName")(prop.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getObjectType(item: SchemaItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectType")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPathParams(params: SchemaParameters): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathParams")(params.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getSafeParamName(param: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSafeParamName")(param.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getType(item: SchemaItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasResourceParam(method: SchemaMethod): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasResourceParam")(method.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSimpleType(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def unRegex(regex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unRegex")(regex.asInstanceOf[js.Any]).asInstanceOf[String]
}
