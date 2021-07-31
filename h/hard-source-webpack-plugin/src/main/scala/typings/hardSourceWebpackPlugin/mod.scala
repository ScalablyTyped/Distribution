package typings.hardSourceWebpackPlugin

import typings.hardSourceWebpackPlugin.anon.Directories
import typings.hardSourceWebpackPlugin.anon.Level
import typings.hardSourceWebpackPlugin.anon.MaxAge
import typings.hardSourceWebpackPlugin.mod.ExcludeModulePlugin.Option
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ForkOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hard-source-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with typings.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(args: js.Any*): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "ExcludeModulePlugin")
  @js.native
  class ExcludeModulePlugin protected () extends StObject {
    def this(options: js.Array[Option]) = this()
    def this(options: Option) = this()
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  object ExcludeModulePlugin {
    
    trait Option extends StObject {
      
      var exclude: js.UndefOr[TestElement] = js.undefined
      
      var include: js.UndefOr[TestElement] = js.undefined
      
      var test: TestElement
    }
    object Option {
      
      @scala.inline
      def apply(test: TestElement): Option = {
        val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
        __obj.asInstanceOf[Option]
      }
      
      @scala.inline
      implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExclude(value: TestElement): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExcludeFunction1(value: /* source */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
        
        @scala.inline
        def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
        
        @scala.inline
        def setExcludeVarargs(value: Option*): Self = StObject.set(x, "exclude", js.Array(value :_*))
        
        @scala.inline
        def setInclude(value: TestElement): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeFunction1(value: /* source */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
        
        @scala.inline
        def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
        
        @scala.inline
        def setIncludeVarargs(value: Option*): Self = StObject.set(x, "include", js.Array(value :_*))
        
        @scala.inline
        def setTest(value: TestElement): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTestFunction1(value: /* source */ String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTestVarargs(value: Option*): Self = StObject.set(x, "test", js.Array(value :_*))
      }
    }
    
    type TestElement = RegExp | String | (js.Function1[/* source */ String, Boolean]) | js.Array[Option]
  }
  
  @JSImport("hard-source-webpack-plugin", "HardSourceLevelDbSerializerPlugin")
  @js.native
  class HardSourceLevelDbSerializerPlugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "LevelDbSerializerPlugin")
  @js.native
  class LevelDbSerializerPlugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "ParallelModulePlugin")
  @js.native
  class ParallelModulePlugin protected () extends StObject {
    def this(options: typings.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options) = this()
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  object ParallelModulePlugin {
    
    trait Options extends StObject {
      
      var fork: js.UndefOr[
            js.Function3[
              /* fork */ forkFn, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
              /* webpackBin */ String, 
              Unit
            ]
          ] = js.undefined
      
      var minModules: js.UndefOr[Double] = js.undefined
      
      var numWorkers: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    }
    object Options {
      
      @scala.inline
      def apply(): typings.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typings.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFork(
          value: (/* fork */ forkFn, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, /* webpackBin */ String) => Unit
        ): Self = StObject.set(x, "fork", js.Any.fromFunction3(value))
        
        @scala.inline
        def setForkUndefined: Self = StObject.set(x, "fork", js.undefined)
        
        @scala.inline
        def setMinModules(value: Double): Self = StObject.set(x, "minModules", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinModulesUndefined: Self = StObject.set(x, "minModules", js.undefined)
        
        @scala.inline
        def setNumWorkers(value: Double | js.Function0[Double]): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumWorkersFunction0(value: () => Double): Self = StObject.set(x, "numWorkers", js.Any.fromFunction0(value))
        
        @scala.inline
        def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
      }
    }
    
    // NOTE: not using `Parameters` and `ReturnType` on purpose to compatibility. better of code this below.
    //     type forkFn = (...args: Parameters<typeof fork>) => ReturnType<typeof fork>
    // this code working on supported versions of `infer` keyword (version 2.8 higher.
    type forkFn = js.Function3[
        /* modulePath */ String, 
        /* args */ js.UndefOr[js.Array[String]], 
        /* options */ js.UndefOr[ForkOptions], 
        ChildProcess
      ]
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerAppend2Plugin")
  @js.native
  class SerializerAppend2Plugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerAppendPlugin")
  @js.native
  class SerializerAppendPlugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerCacachePlugin")
  @js.native
  class SerializerCacachePlugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerJsonPlugin")
  @js.native
  class SerializerJsonPlugin () extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var cacheDirectory: js.UndefOr[String] = js.undefined
    
    var cachePrune: js.UndefOr[MaxAge] = js.undefined
    
    var configHash: js.UndefOr[
        String | (js.Function1[
          /* webpackConfig */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
          ], 
          String
        ])
      ] = js.undefined
    
    var environmentHash: js.UndefOr[Directories] = js.undefined
    
    var info: js.UndefOr[Level] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      @scala.inline
      def setCachePrune(value: MaxAge): Self = StObject.set(x, "cachePrune", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachePruneUndefined: Self = StObject.set(x, "cachePrune", js.undefined)
      
      @scala.inline
      def setConfigHash(
        value: String | (js.Function1[
              /* webpackConfig */ js.UndefOr[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
              ], 
              String
            ])
      ): Self = StObject.set(x, "configHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigHashFunction1(
        value: /* webpackConfig */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
            ] => String
      ): Self = StObject.set(x, "configHash", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConfigHashUndefined: Self = StObject.set(x, "configHash", js.undefined)
      
      @scala.inline
      def setEnvironmentHash(value: Directories): Self = StObject.set(x, "environmentHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentHashUndefined: Self = StObject.set(x, "environmentHash", js.undefined)
      
      @scala.inline
      def setInfo(value: Level): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    }
  }
  
  trait hardSourceWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(args: js.Any*): Unit
  }
  object hardSourceWebpackPlugin {
    
    @scala.inline
    def apply(apply: /* repeated */ js.Any => Unit): typings.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[typings.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin]
    }
    
    @scala.inline
    implicit class hardSourceWebpackPluginMutableBuilder[Self <: typings.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
}
