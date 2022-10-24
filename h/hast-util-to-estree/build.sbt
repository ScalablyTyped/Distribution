organization := "org.scalablytyped"
name := "hast-util-to-estree"
version := "2.1.0-8c3855"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "estree-jsx" % "0.0.1-705203",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-66e306",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-369e05",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-e8c943",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-89385e",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-f3b349",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-6469ad",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-fa3b83",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-bd4ab8",
  "org.scalablytyped" %%% "property-information" % "6.1.1-b23897",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-ecc657")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
