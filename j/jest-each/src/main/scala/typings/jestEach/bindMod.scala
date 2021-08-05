package typings.jestEach

import typings.jestEach.anon.Arguments
import typings.jestTypes.globalMod.ConcurrentTestFn
import typings.jestTypes.globalMod.EachTable
import typings.jestTypes.globalMod.EachTestFn
import typings.jestTypes.globalMod.TemplateData
import typings.jestTypes.globalMod.TestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindMod {
  
  @JSImport("jest-each/build/bind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[EachCallback /* <: TestCallback */](cb: GlobalCallback): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ]]
  inline def default[EachCallback /* <: TestCallback */](cb: GlobalCallback, supportsDone: Boolean): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cb.asInstanceOf[js.Any], supportsDone.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ]]
  
  type EachTests = js.Array[Arguments]
  
  type GlobalCallback = js.Function3[
    /* testName */ String, 
    /* fn */ ConcurrentTestFn, 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ]
}
