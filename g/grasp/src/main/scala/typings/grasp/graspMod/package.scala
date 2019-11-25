package typings.grasp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graspMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.estree.estreeMod.Node

  type GraspReplaceWithQueryEngine = (js.Function1[/* selector */ String, GraspReplaceWithSelector]) with (js.Function2[
    /* selector */ String, 
    /* replacement */ Replacement, 
    js.Function1[/* input */ String, String]
  ]) with (js.Function3[/* selector */ String, /* replacement */ Replacement, /* input */ String, String])
  type GraspReplaceWithSelector = (js.Function1[/* replacement */ Replacement, js.Function1[/* input */ String, String]]) with (js.Function2[/* replacement */ Replacement, /* input */ String, String])
  type GraspSearchWithQueryEngine = (js.Function2[/* selector */ String, /* input */ String, js.Array[Node]]) with (js.Function1[/* selector */ String, js.Function1[/* input */ String, js.Array[Node]]])
  type Replacement = String | (js.Function4[
    /* getRaw */ js.Function1[/* node */ Node, String], 
    /* node */ Node, 
    /* query */ js.Function1[/* q */ String, js.Array[Node]], 
    /* named */ StringDictionary[String | Node], 
    String
  ])
}
