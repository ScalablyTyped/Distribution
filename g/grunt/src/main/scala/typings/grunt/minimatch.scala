package typings.grunt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link https://github.com/isaacs/minimatch}
  */
object minimatch {
  
  /**
    * A minimal matching utility options.
    *
    * This is the matching library used internally by npm.
    * Eventually, it will replace the C binding in node-glob.
    * It works by converting glob expressions into JavaScript RegExp objects.
    */
  trait IMinimatchOptions extends StObject {
    
    /*
      All options are false by default.
      */
    /**
      * Dump a ton of stuff to stderr.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow patterns to match filenames starting with a period,
      * even if the pattern does not explicitly have a period in that spot.
      */
    // Note that by default, a/**\/b will not match a/.d/b, unless dot is set.
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns from negate expressions the same as if they were not negated. (Ie, true on a hit, false on a miss.)
      */
    var flipNegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, then patterns without slashes will be matched against the basename of the path if it contains slashes.
      * For example, a?b would match the path /xyz/123/acb, but not /xyz/acb/123.
      */
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not expand {a,b} and {1..3} brace sets.
      */
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform a case-insensitive match.
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the behavior of treating # at the start of a pattern as a comment.
      */
    var nocomment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable "extglob" style patterns like +(a|b).
      */
    var noext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable ** matching against multiple folder names.
      */
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the behavior of treating a leading ! character as negation.
      */
    var nonegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When a match is not found by minimatch.match, return a list containing the pattern itself.
      * When set, an empty list is returned if there are no matches.
      */
    var nonull: js.UndefOr[Boolean] = js.undefined
  }
  object IMinimatchOptions {
    
    @scala.inline
    def apply(): IMinimatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMinimatchOptions]
    }
    
    @scala.inline
    implicit class IMinimatchOptionsMutableBuilder[Self <: IMinimatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setFlipNegate(value: Boolean): Self = StObject.set(x, "flipNegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipNegateUndefined: Self = StObject.set(x, "flipNegate", js.undefined)
      
      @scala.inline
      def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      @scala.inline
      def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      @scala.inline
      def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      @scala.inline
      def setNocomment(value: Boolean): Self = StObject.set(x, "nocomment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocommentUndefined: Self = StObject.set(x, "nocomment", js.undefined)
      
      @scala.inline
      def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      @scala.inline
      def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      @scala.inline
      def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      @scala.inline
      def setNonull(value: Boolean): Self = StObject.set(x, "nonull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonullUndefined: Self = StObject.set(x, "nonull", js.undefined)
    }
  }
}
