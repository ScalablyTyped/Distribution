package typings.hashIt

import typings.hashIt.mod.hash.is.Comparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @scala.inline
    def apply(`object`: js.Any): Double = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("hash-it", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object is {
      
      /**
        * create a comparator for the object passed to determine if a second is equal
        *
        * @param object the object to test against
        * @returns the method to test against the object
        */
      @scala.inline
      def apply(`object`: js.Any): js.Function1[/* anotherObject */ js.Any, Boolean] = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* anotherObject */ js.Any, Boolean]]
      /**
        * create a comparator for the first object passed to determine if the second is equal
        *
        * @param object the object to test against
        * @param anotherObject the object to compare
        * @returns are the objects equal
        */
      @scala.inline
      def apply(`object`: js.Any, anotherObject: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], anotherObject.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      @JSImport("hash-it", "default.is")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * create a comparator to determine if all of the objects passed are equal in value to the initial
        *
        * @param object the object to test for equality
        * @returns comparator function that checks if all objects equal the initial
        */
      @scala.inline
      def all(`object`: js.Any): Comparator = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(`object`.asInstanceOf[js.Any]).asInstanceOf[Comparator]
      /**
        * determine if all of the objects passed are equal in value to the first
        *
        * @param object the object to test for equality against
        * @param objects the objects to test for equality
        * @returns are the objects equal
        */
      @scala.inline
      def all(`object`: js.Any, objects: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(`object`.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * create a comparator to determine if any objects are equal in value to the initial
        *
        * @param object the object to test for equality
        * @returns comparator function that checks if all the objects equal the initial
        */
      @scala.inline
      def any(`object`: js.Any): Comparator = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(`object`.asInstanceOf[js.Any]).asInstanceOf[Comparator]
      /**
        * determine if any of the objects passed are equal in value to the first
        *
        * @param object the object to test for equality against
        * @param objects the objects to test for equality
        * @returns are the objects equal
        */
      @scala.inline
      def any(`object`: js.Any, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(`object`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * create a comparator for the first object passed to determine if a second is not equal
        *
        * @param object the object to test against
        * @returns the method to test against the object
        */
      @scala.inline
      def not(`object`: js.Any): Comparator = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(`object`.asInstanceOf[js.Any]).asInstanceOf[Comparator]
      /**
        * determine if all of the objects passed are not equal in value to the first
        *
        * @param object the object to test against
        * @param objects the objects to compare
        * @returns are all the objects different from the first
        */
      @scala.inline
      def not(`object`: js.Any, objects: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("not")(`object`.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    }
  }
  
  object hash {
    
    @scala.inline
    def apply(`object`: js.Any): Double = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("hash-it", "hash")
    @js.native
    val ^ : js.Any = js.native
    
    object is {
      
      /**
        * create a comparator for the object passed to determine if a second is equal
        *
        * @param object the object to test against
        * @returns the method to test against the object
        */
      @scala.inline
      def apply(`object`: js.Any): js.Function1[/* anotherObject */ js.Any, Boolean] = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* anotherObject */ js.Any, Boolean]]
      /**
        * create a comparator for the first object passed to determine if the second is equal
        *
        * @param object the object to test against
        * @param anotherObject the object to compare
        * @returns are the objects equal
        */
      @scala.inline
      def apply(`object`: js.Any, anotherObject: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], anotherObject.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      @JSImport("hash-it", "hash.is")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * create a comparator to determine if all of the objects passed are equal in value to the initial
        *
        * @param object the object to test for equality
        * @returns comparator function that checks if all objects equal the initial
        */
      @scala.inline
      def all(`object`: js.Any): Comparator = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(`object`.asInstanceOf[js.Any]).asInstanceOf[Comparator]
      /**
        * determine if all of the objects passed are equal in value to the first
        *
        * @param object the object to test for equality against
        * @param objects the objects to test for equality
        * @returns are the objects equal
        */
      @scala.inline
      def all(`object`: js.Any, objects: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(`object`.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * create a comparator to determine if any objects are equal in value to the initial
        *
        * @param object the object to test for equality
        * @returns comparator function that checks if all the objects equal the initial
        */
      @scala.inline
      def any(`object`: js.Any): Comparator = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(`object`.asInstanceOf[js.Any]).asInstanceOf[Comparator]
      /**
        * determine if any of the objects passed are equal in value to the first
        *
        * @param object the object to test for equality against
        * @param objects the objects to test for equality
        * @returns are the objects equal
        */
      @scala.inline
      def any(`object`: js.Any, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(`object`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * create a comparator for the first object passed to determine if a second is not equal
        *
        * @param object the object to test against
        * @returns the method to test against the object
        */
      @scala.inline
      def not(`object`: js.Any): Comparator = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(`object`.asInstanceOf[js.Any]).asInstanceOf[Comparator]
      /**
        * determine if all of the objects passed are not equal in value to the first
        *
        * @param object the object to test against
        * @param objects the objects to compare
        * @returns are all the objects different from the first
        */
      @scala.inline
      def not(`object`: js.Any, objects: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("not")(`object`.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      @js.native
      trait Comparator extends StObject {
        
        def apply(objects: js.Any*): Boolean = js.native
      }
    }
  }
}
