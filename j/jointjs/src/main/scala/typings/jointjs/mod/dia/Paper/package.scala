package typings.jointjs.mod.dia

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Paper {
  
  type AfterRenderCallback = js.Function3[
    /* stats */ typings.jointjs.mod.dia.Paper.UpdateStats, 
    /* opt */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* paper */ typings.jointjs.mod.dia.Paper, 
    scala.Unit
  ]
  
  type BeforeRenderCallback = js.Function2[
    /* opt */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* paper */ typings.jointjs.mod.dia.Paper, 
    scala.Unit
  ]
  
  type Dimension = scala.Double | java.lang.String | scala.Null
  
  type ProgressCallback = js.Function5[
    /* done */ scala.Boolean, 
    /* processed */ scala.Double, 
    /* total */ scala.Double, 
    /* stats */ typings.jointjs.mod.dia.Paper.UpdateStats, 
    /* paper */ typings.jointjs.mod.dia.Paper, 
    scala.Unit
  ]
  
  type ViewportCallback = js.Function3[
    /* view */ typings.jointjs.mod.mvc.View[js.Any], 
    /* isMounted */ scala.Boolean, 
    /* paper */ typings.jointjs.mod.dia.Paper, 
    scala.Boolean
  ]
}
