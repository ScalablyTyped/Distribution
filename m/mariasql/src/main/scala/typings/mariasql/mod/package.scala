package typings.mariasql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Dictionary = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type MariaCallBackBoolean = js.Function1[/* result */ scala.Boolean, scala.Unit]
  
  type MariaCallBackError = js.Function1[/* error */ typings.std.Error, scala.Unit]
  
  type MariaCallBackInfo = js.Function1[/* result */ typings.mariasql.mod.MariaInfo, scala.Unit]
  
  type MariaCallBackObject = js.Function1[/* result */ js.Object, scala.Unit]
  
  type MariaCallBackResult = js.Function1[/* result */ typings.mariasql.mod.MariaResult, scala.Unit]
  
  type MariaCallBackRow = js.Function1[/* result */ js.Array[js.Any], scala.Unit]
  
  type MariaCallBackVoid = js.Function0[scala.Unit]
}
