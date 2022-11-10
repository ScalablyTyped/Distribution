organization := "org.scalablytyped"
name := "hast-util-to-estree"
version := "2.1.0-756ec7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1ed7c2",
  "org.scalablytyped" %%% "estree-jsx" % "0.0.1-6f51da",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-93ac23",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-aaf55e",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-9867da",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-a59dc1",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-34ba41",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-81ea49",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-6d29ff",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-572d0c",
  "org.scalablytyped" %%% "property-information" % "6.1.1-d418ee",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-cacd8c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
