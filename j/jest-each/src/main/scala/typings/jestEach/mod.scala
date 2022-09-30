package typings.jestEach

import typings.jestEach.anon.Describe
import typings.jestTypes.mod.BlockNameLike
import typings.jestTypes.mod.ConcurrentTestFn
import typings.jestTypes.mod.EachTable
import typings.jestTypes.mod.EachTestFn
import typings.jestTypes.mod.TemplateData
import typings.jestTypes.mod.TestCallback
import typings.node.urlMod.global.Global
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-each", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(
      table: EachTable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type Global.TemplateData is not an array type */ data: TemplateData
    ): ReturnType[
        js.Function3[/* g */ Global, /* table */ EachTable, /* data */ TemplateData, Describe]
      ] = (^.asInstanceOf[js.Dynamic].apply(table.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
        js.Function3[/* g */ Global, /* table */ EachTable, /* data */ TemplateData, Describe]
      ]]
    
    @JSImport("jest-each", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def withGlobal(g: Global): js.Function2[/* table */ EachTable, /* data */ TemplateData, Describe] = ^.asInstanceOf[js.Dynamic].applyDynamic("withGlobal")(g.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* table */ EachTable, /* data */ TemplateData, Describe]]
  }
  
  inline def bind[EachCallback /* <: TestCallback */](cb: GlobalCallback): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ BlockNameLike, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ BlockNameLike, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ]]
  inline def bind[EachCallback /* <: TestCallback */](cb: GlobalCallback, supportsDone: Boolean): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ BlockNameLike, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(cb.asInstanceOf[js.Any], supportsDone.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ BlockNameLike, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ]]
  
  type GlobalCallback = js.Function3[
    /* testName */ String, 
    /* fn */ ConcurrentTestFn, 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ]
}
