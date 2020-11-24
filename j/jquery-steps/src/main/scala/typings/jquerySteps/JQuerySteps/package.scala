package typings.jquerySteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JQuerySteps {
  
  type FunctionOnCancelled = js.Function1[/* event */ java.lang.String, scala.Unit]
  
  type FunctionOnContentLoaded = js.Function2[/* event */ java.lang.String, /* currentIndex */ scala.Double, scala.Unit]
  
  type FunctionOnFinished = js.Function2[/* event */ java.lang.String, /* currentIndex */ scala.Double, scala.Unit]
  
  type FunctionOnFinishing = js.Function2[/* event */ java.lang.String, /* currentIndex */ scala.Double, scala.Boolean]
  
  type FunctionOnInit = js.Function2[/* event */ java.lang.String, /* currentIndex */ scala.Double, scala.Unit]
  
  type FunctionOnStepChanged = js.Function3[
    /* event */ java.lang.String, 
    /* currentIndex */ scala.Double, 
    /* priorIndex */ scala.Double, 
    scala.Unit
  ]
  
  //#endregion "Label Settings"
  //#region "Callback Functions"
  type FunctionOnStepChanging = js.Function3[
    /* event */ java.lang.String, 
    /* currentIndex */ scala.Double, 
    /* newIndex */ scala.Double, 
    scala.Boolean
  ]
}
