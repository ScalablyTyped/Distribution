package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type FailureResponse = ResponseBase

type Filter = StringDictionary[String]

type Headers = StringDictionary[String]

type LoggerCallback = js.Function3[
/* message */ String | js.Array[String], 
/* level */ String, 
/* package */ String, 
Unit]

type ResponseHandler[T] = js.Function1[/* response */ T, Unit]
