package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graspMod {
  type GraspReplaceWithQueryEngine = (js.Function1[/* selector */ java.lang.String, GraspReplaceWithSelector]) with (js.Function2[
    /* selector */ java.lang.String, 
    /* replacement */ Replacement, 
    js.Function1[/* input */ java.lang.String, java.lang.String]
  ]) with (js.Function3[
    /* selector */ java.lang.String, 
    /* replacement */ Replacement, 
    /* input */ java.lang.String, 
    java.lang.String
  ])
  type GraspReplaceWithSelector = (js.Function1[
    /* replacement */ Replacement, 
    js.Function1[/* input */ java.lang.String, java.lang.String]
  ]) with (js.Function2[/* replacement */ Replacement, /* input */ java.lang.String, java.lang.String])
  type GraspSearchWithQueryEngine = (js.Function2[
    /* selector */ java.lang.String, 
    /* input */ java.lang.String, 
    js.Array[estreeLib.estreeMod.Node]
  ]) with (js.Function1[
    /* selector */ java.lang.String, 
    js.Function1[/* input */ java.lang.String, js.Array[estreeLib.estreeMod.Node]]
  ])
  type Replacement = java.lang.String | (js.Function4[
    /* getRaw */ js.Function1[/* node */ estreeLib.estreeMod.Node, java.lang.String], 
    /* node */ estreeLib.estreeMod.Node, 
    /* query */ js.Function1[/* q */ java.lang.String, js.Array[estreeLib.estreeMod.Node]], 
    /* named */ org.scalablytyped.runtime.StringDictionary[java.lang.String | estreeLib.estreeMod.Node], 
    java.lang.String
  ])
}
