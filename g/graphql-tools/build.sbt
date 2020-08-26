organization := "org.scalablytyped"
name := "graphql-tools"
version := "6.0.15-4ad55c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.14-246d1b",
  "org.scalablytyped" %%% "babel__parser" % "7.11.0-0fe02f",
  "org.scalablytyped" %%% "babel__types" % "7.11.0-b7a397",
  "org.scalablytyped" %%% "dataloader" % "2.0.0-01f800",
  "org.scalablytyped" %%% "fast-glob" % "3.2.4-217b92",
  "org.scalablytyped" %%% "globby" % "11.0.1-a51ff5",
  "org.scalablytyped" %%% "graphql" % "15.3.0-ff42a4",
  "org.scalablytyped" %%% "graphql-tools__batch-delegate" % "6.0.15-a9907f",
  "org.scalablytyped" %%% "graphql-tools__code-file-loader" % "6.0.15-77750e",
  "org.scalablytyped" %%% "graphql-tools__delegate" % "6.0.15-f965b4",
  "org.scalablytyped" %%% "graphql-tools__git-loader" % "6.0.15-739bfd",
  "org.scalablytyped" %%% "graphql-tools__github-loader" % "6.0.15-1d54d3",
  "org.scalablytyped" %%% "graphql-tools__graphql-file-loader" % "6.0.15-1b5c6f",
  "org.scalablytyped" %%% "graphql-tools__graphql-tag-pluck" % "6.0.15-842720",
  "org.scalablytyped" %%% "graphql-tools__import" % "6.0.15-aca8f8",
  "org.scalablytyped" %%% "graphql-tools__links" % "6.0.15-f549f3",
  "org.scalablytyped" %%% "graphql-tools__load" % "6.0.15-390241",
  "org.scalablytyped" %%% "graphql-tools__load-files" % "6.0.15-60ac36",
  "org.scalablytyped" %%% "graphql-tools__merge" % "6.0.15-47823b",
  "org.scalablytyped" %%% "graphql-tools__mock" % "6.0.15-ff83ed",
  "org.scalablytyped" %%% "graphql-tools__module-loader" % "6.0.15-b04ab6",
  "org.scalablytyped" %%% "graphql-tools__relay-operation-optimizer" % "6.0.15-571d5d",
  "org.scalablytyped" %%% "graphql-tools__resolvers-composition" % "6.0.15-2edd42",
  "org.scalablytyped" %%% "graphql-tools__schema" % "6.0.15-6e3d37",
  "org.scalablytyped" %%% "graphql-tools__stitch" % "6.0.15-085646",
  "org.scalablytyped" %%% "graphql-tools__url-loader" % "6.0.15-86ac28",
  "org.scalablytyped" %%% "graphql-tools__utils" % "6.0.15-4d454d",
  "org.scalablytyped" %%% "graphql-tools__wrap" % "6.0.15-e4aefc",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-225474",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-95b1f7",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-032fc3",
  "org.scalablytyped" %%% "p-limit" % "3.0.2-45009f",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "websocket" % "1.0-dt-20200707Z-fa4748",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.21-e83db8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
