organization := "org.scalablytyped"
name := "hast-util-to-estree"
version := "2.1.0-1de154"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-bee5c7",
  "org.scalablytyped" %%% "estree-jsx" % "0.0.1-b6d280",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-8aa810",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-ec20cb",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-d60acc",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-d28823",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-27fa39",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-4102a2",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-b850f4",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-f5065a",
  "org.scalablytyped" %%% "property-information" % "6.1.1-c1ad28",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-f6f04e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
