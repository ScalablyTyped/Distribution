package typings.hyperformula

import typings.hyperformula.hyperformulaBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jstatMod {
  
  @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object beta {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "beta")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, alpha: Double, beta: Double): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
    
    inline def inv(x: Double, alpha: Double, beta: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inv")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(x: Double, alpha: Double, beta: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object binomial {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "binomial")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, n: Double, p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(k: Double, n: Double, p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(k.asInstanceOf[js.Any], n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object centralF {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "centralF")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, df1: Double, df2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], df1.asInstanceOf[js.Any], df2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def inv(x: Double, df1: Double, df2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inv")(x.asInstanceOf[js.Any], df1.asInstanceOf[js.Any], df2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(x: Double, df1: Double, df2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(x.asInstanceOf[js.Any], df1.asInstanceOf[js.Any], df2.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object chisquare {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "chisquare")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, dof: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], dof.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def inv(p: Double, dof: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inv")(p.asInstanceOf[js.Any], dof.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(x: Double, dof: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(x.asInstanceOf[js.Any], dof.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def corrcoeff(arr1: js.Array[Double], arr2: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("corrcoeff")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def covariance(arr1: js.Array[Double], arr2: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("covariance")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def erf(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("erf")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def erfc(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("erfc")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  object exponential {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "exponential")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, rate: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], rate.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(x: Double, rate: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(x.asInstanceOf[js.Any], rate.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def factorial(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("factorial")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def factorialln(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("factorialln")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  object gamma {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "gamma")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, shape: Double, scale: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def inv(p: Double, shape: Double, scale: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inv")(p.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(x: Double, shape: Double, scale: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def gammafn(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("gammafn")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def gammaln(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("gammaln")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def geomean(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geomean")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  object hypgeom {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "hypgeom")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, N: Double, m: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], N.asInstanceOf[js.Any], m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(k: Double, N: Double, m: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(k.asInstanceOf[js.Any], N.asInstanceOf[js.Any], m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object lognormal {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "lognormal")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, mu: Double, sigma: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], mu.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def inv(p: Double, mu: Double, sigma: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inv")(p.asInstanceOf[js.Any], mu.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(x: Double, mu: Double, sigma: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(x.asInstanceOf[js.Any], mu.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def mean(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  object negbin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "negbin")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, r: Double, p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(k: Double, r: Double, p: Double): Double | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(k.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double | `false`]
  }
  
  object normal {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "normal")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, mean: Double, std: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], std.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def inv(p: Double, mean: Double, std: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inv")(p.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], std.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(x: Double, mean: Double, std: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], std.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def normalci(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalci")().asInstanceOf[js.Array[Any]]
  
  object poisson {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "poisson")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, l: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(k: Double, l: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(k.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def stdev(arr: js.Array[Double], flag: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("stdev")(arr.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object studentt {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "studentt")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, dof: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], dof.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def inv(p: Double, dof: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inv")(p.asInstanceOf[js.Any], dof.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(x: Double, dof: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(x.asInstanceOf[js.Any], dof.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def sumsqerr(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sumsqerr")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def tci(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tci")().asInstanceOf[js.Array[Any]]
  
  inline def variance(arr: js.Array[Double], flag: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("variance")(arr.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object weibull {
    
    @JSImport("hyperformula/typings/interpreter/plugin/3rdparty/jstat/jstat", "weibull")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cdf(x: Double, scale: Double, shape: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cdf")(x.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pdf(x: Double, scale: Double, shape: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pdf")(x.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
