package typings.jsonQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Context = js.Any
  
  type Filter = js.Function2[
    /* input */ typings.jsonQuery.mod.Context, 
    /* repeated */ js.Any, 
    typings.jsonQuery.mod.Context
  ]
  
  type Locals = org.scalablytyped.runtime.StringDictionary[typings.jsonQuery.mod.Filter]
  
  type QueryParam = js.Any
  
  type Selector = java.lang.String
  
  // No way to support [Selector, ...QueryParam[]]?
  // 10 params should be more than enough, hopefully.
  type SelectorWithQueryParams = (js.Tuple2[typings.jsonQuery.mod.Selector, typings.jsonQuery.mod.QueryParam]) | (js.Tuple3[
    typings.jsonQuery.mod.Selector, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam
  ]) | (js.Tuple4[
    typings.jsonQuery.mod.Selector, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam
  ]) | (js.Tuple5[
    typings.jsonQuery.mod.Selector, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam
  ]) | (js.Tuple6[
    typings.jsonQuery.mod.Selector, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam
  ]) | (js.Tuple7[
    typings.jsonQuery.mod.Selector, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam
  ]) | (js.Tuple8[
    typings.jsonQuery.mod.Selector, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam
  ]) | (js.Tuple9[
    typings.jsonQuery.mod.Selector, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam
  ]) | (js.Tuple10[
    typings.jsonQuery.mod.Selector, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam
  ]) | (js.Tuple11[
    typings.jsonQuery.mod.Selector, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam, 
    typings.jsonQuery.mod.QueryParam
  ])
}
