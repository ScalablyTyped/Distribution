organization := "org.scalablytyped"
name := "hast-util-to-estree"
version := "2.1.0-01b012"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6dfb17",
  "org.scalablytyped" %%% "estree-jsx" % "0.0.1-8640dd",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-9dd461",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-21ee44",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-2d0877",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-2f08b4",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-7f27d8",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-78139e",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-87df65",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-653228",
  "org.scalablytyped" %%% "property-information" % "6.1.1-2cd5bb",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-70245a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
