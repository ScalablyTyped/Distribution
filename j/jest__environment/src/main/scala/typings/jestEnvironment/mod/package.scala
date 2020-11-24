package typings.jestEnvironment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JestMockFn = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jestMock.fn */ js.Any
  
  type JestMockSpyOn = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jestMock.spyOn */ js.Any
  
  type Module = typings.node.NodeModule
  
  type ModuleWrapper = js.ThisFunction8[
    /* import warning: importer.ImportType#apply Failed type conversion: @jest/environment.@jest/environment.Module['exports'] */ /* this */ js.Any, 
    /* module */ typings.jestEnvironment.mod.Module, 
    /* import warning: importer.ImportType#apply Failed type conversion: @jest/environment.@jest/environment.Module['exports'] */ /* exports */ js.Any, 
    /* require */ typings.node.NodeJS.Require with (js.Function1[/* id */ java.lang.String, _]), 
    /* __dirname */ java.lang.String, 
    /* __filename */ java.lang.String, 
    /* global */ typings.jestTypes.globalMod.Global, 
    /* jest */ js.UndefOr[typings.jestEnvironment.mod.Jest], 
    /* repeated */ js.UndefOr[
      (js.Function0[
        js.Any | js.Array[js.Any] | scala.Boolean | scala.Double | typings.std.Error | typings.std.EvalError | typings.std.RangeError | typings.std.ReferenceError | java.lang.String | typings.std.SyntaxError | typings.std.TypeError | typings.std.URIError | scala.Unit
      ]) | (typings.jestTypes.globalMod.ItBase with typings.jestEnvironment.anon.FnCall) | (js.Function2[
        (/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit]) | (/* s */ java.lang.String), 
        (/* repeated */ js.Any) | (/* radix */ scala.Double), 
        scala.Double | typings.node.NodeJS.Immediate
      ]) | (typings.std.DataViewConstructor with (org.scalablytyped.runtime.Instantiable1[/* buffer */ typings.std.ArrayBufferLike, typings.std.global.DataView])) | (typings.std.Float32ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Float32Array])) | (typings.std.Int8ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Int8Array])) | typings.std.WeakSetConstructor | (js.Function1[
        (/* uriComponent */ scala.Boolean) | (/* number */ scala.Double) | (/* callback */ js.Function0[scala.Unit]) | (/* immediateId */ typings.node.NodeJS.Immediate) | (/* pattern */ typings.std.RegExp) | (/* encodedURI */ java.lang.String) | (/* timeoutId */ typings.node.NodeJS.Timeout), 
        js.Any | scala.Boolean | scala.Double | js.Function | typings.std.RegExp | java.lang.String | scala.Unit
      ]) | (typings.std.Uint32ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Uint32Array])) | typings.node.NodeJS.Global | (typings.std.Uint8ClampedArrayConstructor with (org.scalablytyped.runtime.Instantiable1[
        /* elements */ typings.std.Iterable[scala.Double], 
        typings.std.global.Uint8ClampedArray
      ])) | (typings.std.Float64ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Float64Array])) | (typings.std.Int16ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Int16Array])) | scala.Double | typings.std.SetConstructor | (typings.jestTypes.globalMod.Describe with (js.Function2[
        /* blockName */ typings.jestTypes.globalMod.BlockName, 
        /* blockFn */ typings.jestTypes.globalMod.BlockFn, 
        scala.Unit
      ])) | typings.std.JSON | (typings.jestTypes.anon.ItBaseconcurrentItConcurr with typings.jestEnvironment.anon.FnCall) | js.Function | (typings.jestTypes.globalMod.ItConcurrent with typings.jestEnvironment.anon.FnCall) | typings.istanbulLibCoverage.mod.CoverageMapData | typings.node.anon.TypeofBuffer | (typings.std.Uint8ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Uint8Array])) | (typings.std.Int32ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Int32Array])) | (typings.std.PromiseConstructor with (org.scalablytyped.runtime.Instantiable1[
        /* executor */ js.Function2[
          /* resolve */ js.Function1[
            /* value */ (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]), 
            scala.Unit
          ], 
          /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
          scala.Unit
        ], 
        typings.std.global.Promise[js.Object]
      ])) | (typings.std.Uint16ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Uint16Array])) | typings.std.Math | (js.Function3[
        /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
        /* ms */ scala.Double, 
        /* repeated */ js.Any, 
        typings.node.NodeJS.Timeout
      ]) | typings.jestTypes.globalMod.Jasmine | js.Any | (typings.jestTypes.globalMod.DescribeBase with (js.Function2[
        /* blockName */ typings.jestTypes.globalMod.BlockName, 
        /* blockFn */ typings.jestTypes.globalMod.BlockFn, 
        scala.Unit
      ])) | typings.std.WeakMapConstructor | (typings.jestTypes.globalMod.HookBase with typings.jestEnvironment.anon.FnCallFnTimeout) | (typings.std.ArrayBufferConstructor with (org.scalablytyped.runtime.Instantiable1[/* byteLength */ scala.Double, typings.std.global.ArrayBuffer])) | typings.std.MapConstructor
    ], 
    js.Any
  ]
}
