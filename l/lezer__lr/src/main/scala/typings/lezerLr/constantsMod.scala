package typings.lezerLr

import typings.lezerLr.lezerLrNumbers.`0`
import typings.lezerLr.lezerLrNumbers.`126`
import typings.lezerLr.lezerLrNumbers.`131072`
import typings.lezerLr.lezerLrNumbers.`14`
import typings.lezerLr.lezerLrNumbers.`19`
import typings.lezerLr.lezerLrNumbers.`1`
import typings.lezerLr.lezerLrNumbers.`262144`
import typings.lezerLr.lezerLrNumbers.`2`
import typings.lezerLr.lezerLrNumbers.`32`
import typings.lezerLr.lezerLrNumbers.`34`
import typings.lezerLr.lezerLrNumbers.`3`
import typings.lezerLr.lezerLrNumbers.`46`
import typings.lezerLr.lezerLrNumbers.`4`
import typings.lezerLr.lezerLrNumbers.`5`
import typings.lezerLr.lezerLrNumbers.`65535`
import typings.lezerLr.lezerLrNumbers.`65536`
import typings.lezerLr.lezerLrNumbers.`6`
import typings.lezerLr.lezerLrNumbers.`92`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.lezerLr.lezerLrNumbers.`65536`
    - typings.lezerLr.lezerLrNumbers.`65535`
    - typings.lezerLr.lezerLrNumbers.`19`
    - typings.lezerLr.lezerLrNumbers.`131072`
    - typings.lezerLr.lezerLrNumbers.`262144`
  */
  trait Action extends StObject
  object Action {
    
    inline def GotoFlag: `131072` = 131072.asInstanceOf[`131072`]
    
    inline def ReduceDepthShift: `19` = 19.asInstanceOf[`19`]
    
    inline def ReduceFlag: `65536` = 65536.asInstanceOf[`65536`]
    
    inline def RepeatFlag: `131072` = 131072.asInstanceOf[`131072`]
    
    inline def StayFlag: `262144` = 262144.asInstanceOf[`262144`]
    
    inline def ValueMask: `65535` = 65535.asInstanceOf[`65535`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lezerLr.lezerLrNumbers.`126`
    - typings.lezerLr.lezerLrNumbers.`65535`
    - typings.lezerLr.lezerLrNumbers.`32`
    - typings.lezerLr.lezerLrNumbers.`34`
    - typings.lezerLr.lezerLrNumbers.`92`
    - typings.lezerLr.lezerLrNumbers.`46`
  */
  trait Encode extends StObject
  object Encode {
    
    inline def Base: `46` = 46.asInstanceOf[`46`]
    
    inline def BigVal: `65535` = 65535.asInstanceOf[`65535`]
    
    inline def BigValCode: `126` = 126.asInstanceOf[`126`]
    
    inline def Gap1: `34` = 34.asInstanceOf[`34`]
    
    inline def Gap2: `92` = 92.asInstanceOf[`92`]
    
    inline def Start: `32` = 32.asInstanceOf[`32`]
  }
  
  object File {
    
    inline def Version: `14` = 14.asInstanceOf[`14`]
  }
  type File = `14`
  
  /* Rewritten from type alias, can be one of: 
    - typings.lezerLr.lezerLrNumbers.`0`
    - typings.lezerLr.lezerLrNumbers.`1`
    - typings.lezerLr.lezerLrNumbers.`2`
    - typings.lezerLr.lezerLrNumbers.`3`
    - typings.lezerLr.lezerLrNumbers.`4`
    - typings.lezerLr.lezerLrNumbers.`5`
    - typings.lezerLr.lezerLrNumbers.`6`
  */
  trait ParseState extends StObject
  object ParseState {
    
    inline def Actions: `1` = 1.asInstanceOf[`1`]
    
    inline def DefaultReduce: `4` = 4.asInstanceOf[`4`]
    
    inline def Flags: `0` = 0.asInstanceOf[`0`]
    
    inline def ForcedReduce: `5` = 5.asInstanceOf[`5`]
    
    inline def Size: `6` = 6.asInstanceOf[`6`]
    
    inline def Skip: `2` = 2.asInstanceOf[`2`]
    
    inline def TokenizerMask: `3` = 3.asInstanceOf[`3`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lezerLr.lezerLrNumbers.`65535`
    - typings.lezerLr.lezerLrNumbers.`0`
    - typings.lezerLr.lezerLrNumbers.`1`
    - typings.lezerLr.lezerLrNumbers.`2`
  */
  trait Seq extends StObject
  object Seq {
    
    inline def Done: `0` = 0.asInstanceOf[`0`]
    
    inline def End: `65535` = 65535.asInstanceOf[`65535`]
    
    inline def Next: `1` = 1.asInstanceOf[`1`]
    
    inline def Other: `2` = 2.asInstanceOf[`2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lezerLr.lezerLrNumbers.`0`
    - typings.lezerLr.lezerLrNumbers.`1`
  */
  trait Specialize extends StObject
  object Specialize {
    
    inline def Extend: `1` = 1.asInstanceOf[`1`]
    
    inline def Specialize: `0` = 0.asInstanceOf[`0`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lezerLr.lezerLrNumbers.`1`
    - typings.lezerLr.lezerLrNumbers.`2`
  */
  trait StateFlag extends StObject
  object StateFlag {
    
    inline def Accepting: `2` = 2.asInstanceOf[`2`]
    
    inline def Skipped: `1` = 1.asInstanceOf[`1`]
  }
  
  object Term {
    
    inline def Err: `0` = 0.asInstanceOf[`0`]
  }
  type Term = `0`
}
