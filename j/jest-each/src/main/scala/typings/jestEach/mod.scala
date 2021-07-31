package typings.jestEach

import typings.jestEach.anon.Describe
import typings.jestEach.bindMod.GlobalCallback
import typings.jestTypes.globalMod.EachTable
import typings.jestTypes.globalMod.EachTestFn
import typings.jestTypes.globalMod.TemplateData
import typings.jestTypes.globalMod.TestCallback
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-each", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    def withGlobal(g: Global): js.Function2[/* table */ EachTable, /* data */ TemplateData, Describe] = ^.asInstanceOf[js.Dynamic].applyDynamic("withGlobal")(g.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* table */ EachTable, /* data */ TemplateData, Describe]]
  }
  
  @scala.inline
  def bind[EachCallback /* <: TestCallback */](cb: GlobalCallback): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ]]
  @scala.inline
  def bind[EachCallback /* <: TestCallback */](cb: GlobalCallback, supportsDone: Boolean): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(cb.asInstanceOf[js.Any], supportsDone.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ]]
  
  type Global = typings.jestTypes.globalMod.Global
}
