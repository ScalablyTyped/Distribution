package typings.grasp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GraspReplaceWithQueryEngine = (js.Function1[/* selector */ java.lang.String, typings.grasp.mod.GraspReplaceWithSelector]) with (js.Function2[
    /* selector */ java.lang.String, 
    /* replacement */ typings.grasp.mod.Replacement, 
    js.Function1[/* input */ java.lang.String, java.lang.String]
  ]) with (js.Function3[
    /* selector */ java.lang.String, 
    /* replacement */ typings.grasp.mod.Replacement, 
    /* input */ java.lang.String, 
    java.lang.String
  ])
  
  type GraspReplaceWithSelector = (js.Function1[
    /* replacement */ typings.grasp.mod.Replacement, 
    js.Function1[/* input */ java.lang.String, java.lang.String]
  ]) with (js.Function2[
    /* replacement */ typings.grasp.mod.Replacement, 
    /* input */ java.lang.String, 
    java.lang.String
  ])
  
  type GraspSearchWithQueryEngine = (js.Function2[
    /* selector */ java.lang.String, 
    /* input */ java.lang.String, 
    js.Array[typings.estree.mod.Node]
  ]) with (js.Function1[
    /* selector */ java.lang.String, 
    js.Function1[/* input */ java.lang.String, js.Array[typings.estree.mod.Node]]
  ])
  
  type Replacement = java.lang.String | (js.Function4[
    /* getRaw */ js.Function1[/* node */ typings.estree.mod.Node, java.lang.String], 
    /* node */ typings.estree.mod.Node, 
    /* query */ js.Function1[/* q */ java.lang.String, js.Array[typings.estree.mod.Node]], 
    /* named */ org.scalablytyped.runtime.StringDictionary[java.lang.String | typings.estree.mod.Node], 
    java.lang.String
  ])
}
