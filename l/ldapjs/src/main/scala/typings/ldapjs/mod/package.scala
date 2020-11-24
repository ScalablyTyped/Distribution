package typings.ldapjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallBack = js.Function2[
    /* error */ typings.ldapjs.mod.Error | scala.Null, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type CompareCallback = js.Function2[
    /* error */ typings.ldapjs.mod.Error | scala.Null, 
    /* matched */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  
  type Control = js.Any
  
  type ErrorCallback = js.Function1[/* error */ typings.ldapjs.mod.Error, scala.Unit]
  
  type ExopCallback = js.Function3[
    /* error */ typings.ldapjs.mod.Error | scala.Null, 
    /* value */ java.lang.String, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type SearchCallBack = js.Function2[
    /* error */ typings.ldapjs.mod.Error | scala.Null, 
    /* result */ typings.ldapjs.mod.SearchCallbackResponse, 
    scala.Unit
  ]
  
  type SearchReference = js.Any
}
