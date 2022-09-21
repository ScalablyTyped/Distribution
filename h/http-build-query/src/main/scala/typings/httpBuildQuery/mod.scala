package typings.httpBuildQuery

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(queryData: StringDictionary[String | Double | Null]): String = ^.asInstanceOf[js.Dynamic].apply(queryData.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(queryData: StringDictionary[String | Double | Null], numericPrefix: String): String = (^.asInstanceOf[js.Dynamic].apply(queryData.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(queryData: StringDictionary[String | Double | Null], numericPrefix: String, argSeparator: String): String = (^.asInstanceOf[js.Dynamic].apply(queryData.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    queryData: StringDictionary[String | Double | Null],
    numericPrefix: String,
    argSeparator: String,
    tempKey: String
  ): String = (^.asInstanceOf[js.Dynamic].apply(queryData.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any], tempKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    queryData: StringDictionary[String | Double | Null],
    numericPrefix: String,
    argSeparator: Unit,
    tempKey: String
  ): String = (^.asInstanceOf[js.Dynamic].apply(queryData.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any], tempKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(queryData: StringDictionary[String | Double | Null], numericPrefix: Unit, argSeparator: String): String = (^.asInstanceOf[js.Dynamic].apply(queryData.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    queryData: StringDictionary[String | Double | Null],
    numericPrefix: Unit,
    argSeparator: String,
    tempKey: String
  ): String = (^.asInstanceOf[js.Dynamic].apply(queryData.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any], tempKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    queryData: StringDictionary[String | Double | Null],
    numericPrefix: Unit,
    argSeparator: Unit,
    tempKey: String
  ): String = (^.asInstanceOf[js.Dynamic].apply(queryData.asInstanceOf[js.Any], numericPrefix.asInstanceOf[js.Any], argSeparator.asInstanceOf[js.Any], tempKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("http-build-query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
