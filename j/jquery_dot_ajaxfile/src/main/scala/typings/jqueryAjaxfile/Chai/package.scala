package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Chai {
  
  type AssertStatic = typings.jqueryAjaxfile.Chai.Assert
  
  type AssertionStatic = js.Function2[
    /* target */ js.Any, 
    /* message */ js.UndefOr[java.lang.String], 
    typings.jqueryAjaxfile.Chai.Assertion
  ]
  
  type Equal = js.Function2[
    /* value */ js.Any, 
    /* message */ js.UndefOr[java.lang.String], 
    typings.jqueryAjaxfile.Chai.Assertion
  ]
  
  type ExpectStatic = typings.jqueryAjaxfile.Chai.AssertionStatic
  
  type InstanceOf = js.Function2[
    /* constructor */ typings.jqueryAjaxfile.Object, 
    /* message */ js.UndefOr[java.lang.String], 
    typings.jqueryAjaxfile.Chai.Assertion
  ]
  
  type Members = js.Function2[
    /* set */ js.Array[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    typings.jqueryAjaxfile.Chai.Assertion
  ]
  
  type NumberComparer = js.Function2[
    /* value */ scala.Double, 
    /* message */ js.UndefOr[java.lang.String], 
    typings.jqueryAjaxfile.Chai.Assertion
  ]
  
  type OwnProperty = js.Function2[
    /* name */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    typings.jqueryAjaxfile.Chai.Assertion
  ]
  
  type Property = js.Function3[
    /* name */ java.lang.String, 
    /* value */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    typings.jqueryAjaxfile.Chai.Assertion
  ]
}
